package org.securegraph.util;

import java.io.Closeable;

public interface CloseableIterable<T> extends Iterable<T>, Closeable {
}
