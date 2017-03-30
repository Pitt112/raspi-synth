package de.moonset.engine.audio.wavetable

import java.util.function.Supplier


/**
 * Created by pitt on 29.03.17.
 */
enum WaveForm {

    SINE({ sample, frequency, sampleRate -> Math.sin((2 * Math.PI * sample * frequency) / sampleRate) })

    private final Supplier<WavetableCalculator> factory

    WaveForm(final Supplier<WavetableCalculator> factory) {
        this.factory = factory
    }

    WavetableCalculator create() { factory.get() }
}
