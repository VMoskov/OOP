class Itertools {
    public static <T> Iterable<T> chain(Iterable<? extends T>... iterables) {
        return () -> new ChainIterator<>(iterables);
    }

    private static class ChainIterator<T> implements Iterator<T> {
        private final Iterable<? extends T>[] iterables;
        private Iterator<? extends T> currentIterator;
        private int currentIndex;


        private ChainIterator(Iterable<? extends T>... iterables) {
            this.iterables = iterables;
            currentIndex = 0;
            currentIterator = iterables[currentIndex].iterator();
        }

        @Override
        public boolean hasNext() {
            while (!currentIterator.hasNext()) {
                currentIndex++;
                if (currentIndex >= iterables.length) {
                    return false;
                }
                currentIterator = iterables[currentIndex].iterator();
            }
            return true;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            return currentIterator.next();
        }
    }
}