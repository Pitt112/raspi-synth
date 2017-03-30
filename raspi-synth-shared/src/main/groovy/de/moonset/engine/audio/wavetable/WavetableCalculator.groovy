package de.moonset.engine.audio.wavetable

/**
 * Created by pitt on 29.03.17.
 */
interface WavetableCalculator {
    float computeSample(int sample, float frequency, float sampleRate)
}
