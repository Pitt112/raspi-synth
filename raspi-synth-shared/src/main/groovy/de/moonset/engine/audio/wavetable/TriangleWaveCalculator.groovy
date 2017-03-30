package de.moonset.engine.audio.wavetable

/**
 * Created by pitt on 29.03.17.
 */
final class TriangleWaveCalculator extends ComplexWavetableCalculator {

    TriangleWaveCalculator(final int finalHarmonic) {
        super(finalHarmonic)
    }

    @Override
    double amplitudeForHarmonic(final int harmonic) {
        (float) ((1.0 / (harmonic * harmonic)) * Math.sin(harmonic * Math.PI / 2) * (8.0 / (Math.PI * Math.PI)))
    }

    @Override
    boolean isHarmonicIncluded(final int harmonic) {
        harmonic % 2 != 0
    }
}
