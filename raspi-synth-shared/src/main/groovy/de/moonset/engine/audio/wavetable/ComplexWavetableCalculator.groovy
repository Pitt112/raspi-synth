package de.moonset.engine.audio.wavetable

import java.util.stream.IntStream

/**
 * Created by pitt on 29.03.17.
 */
abstract class ComplexWavetableCalculator implements WavetableCalculator {

    private final int finalHarmonic;
    private final static WavetableCalculator SINE_WAVE_CALCULATOR = new SineWaveCalculator()

    ComplexWavetableCalculator(final int finalHarmonic) {
        this.finalHarmonic = finalHarmonic
    }

    @Override
    float computeSample(final int sample, final float frequency, final float sampleRate) {

        IntStream.range(1, finalHarmonic)
                .filter({ i -> isHarmonicIncluded(i) })
                .mapToDouble({ i -> calculateHarmonicSignal(sample, frequency, sampleRate, i) })
                .sum()

    }

    abstract float amplitudeForHarmonic(int harmonic)

    abstract boolean isHarmonicIncluded(int harmonic)

    private float calculateHarmonicSignal(int sample, float frequency, float sampleRate, int currentHarmonic) {
        float harmonicFrequency = frequency * currentHarmonic
        float harmonicSignal = SINE_WAVE_CALCULATOR.computeSample(sample, harmonicFrequency, sampleRate)
        float harmonicAmplitude = amplitudeForHarmonic(currentHarmonic)
        return harmonicAmplitude * harmonicSignal
    }
}
