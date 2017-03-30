package de.moonset.engine.audio.wavetable

import com.carrotsearch.hppc.ShortContainer

/**
 * Created by pitt on 28.03.17.
 */
class Wavetable {

    final short[] samples;

    Wavetable(ShortContainer samples) {
        this.samples = samples.toArray()
    }

    def get(short position) {
        int i = position % samples.size()
        return samples[i]
    }
}
