package com.company;

@FunctionalInterface
public interface Process {

   int[] process(int a, int b);
}

class Numbers {

    public int[] getFilledArray(final int a, final int b, final Process p) {
        int[] array;
        array = p.process(a, b);
        return array;
    }
    }

