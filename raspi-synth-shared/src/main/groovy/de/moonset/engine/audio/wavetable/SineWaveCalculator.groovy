package de.moonset.engine.audio.wavetable

/**
 * Created by pitt on 29.03.17.
 */
class SineWaveCalculator implements WavetableCalculator {
    @Override
    float computeSample(final int sample, final float frequency, final float sampleRate) {
        Math.sin((2 * Math.PI * sample * frequency) / sampleRate);
    }
}
