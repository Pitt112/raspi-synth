package de.moonset.engine.audio.wavetable

/**
 * Created by pitt on 29.03.17.
 */
final class SawtoothWaveCalculator extends ComplexWavetableCalculator {

    SawtoothWaveCalculator(final int finalHarmonic) {
        super(finalHarmonic)
    }

    @Override
    float amplitudeForHarmonic(final int harmonic) { (1.0 / harmonic) * (2.0 / Math.PI) }

    @Override
    boolean isHarmonicIncluded(final int harmonic) { true }
}
