package com.tencent.qqmusic.mediaplayer.upstream;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class Chunk {
    public final int bufferSize;
    public final long size;
    public final long start;

    public Chunk(int i, long j, long j2) {
        this.bufferSize = i;
        this.start = j;
        this.size = j2;
    }

    public boolean contains(long j) {
        AppMethodBeat.i(104563);
        if (isEndless()) {
            if (j >= this.start) {
                AppMethodBeat.o(104563);
                return true;
            }
            AppMethodBeat.o(104563);
            return false;
        } else if (j < this.start || j > this.start + this.size) {
            AppMethodBeat.o(104563);
            return false;
        } else {
            AppMethodBeat.o(104563);
            return true;
        }
    }

    public boolean isEndless() {
        return this.size == -1;
    }

    public String toString() {
        AppMethodBeat.i(104564);
        String str = "Chunk{bufferSize=" + this.bufferSize + ", start=" + this.start + ", size=" + this.size + '}';
        AppMethodBeat.o(104564);
        return str;
    }
}
