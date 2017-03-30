package de.moonset.engine.audio.wavetable

/**
 * Created by pitt on 29.03.17.
 */
class SquareWaveCalculator extends ComplexWavetableCalculator {

    SquareWaveCalculator(final int finalHarmonic) {
        super(finalHarmonic)
    }

    @Override
    double amplitudeForHarmonic(final int harmonic) {
        (1.0 / harmonic) * (4.0 / Math.PI)
    }

    @Override
    boolean isHarmonicIncluded(final int harmonic) {
        harmonic % 2 != 0
    }
}
