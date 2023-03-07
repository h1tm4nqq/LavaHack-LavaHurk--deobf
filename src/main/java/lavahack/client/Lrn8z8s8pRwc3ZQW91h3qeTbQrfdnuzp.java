/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package lavahack.client;

import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import org.apache.logging.log4j.Logger;

public class Lrn8z8s8pRwc3ZQW91h3qeTbQrfdnuzp
extends java.util.logging.Logger {
    private final Logger Field14297;
    private String Field14298 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Lrn8z8s8pRwc3ZQW91h3qeTbQrfdnuzp(Logger logger) {
        super("logger", null);
        this.Field14297 = logger;
    }

    @Override
    public void log(LogRecord logRecord) {
        this.log(logRecord.getLevel(), logRecord.getMessage());
    }

    @Override
    public void log(Level level, String string) {
        if (level == Level.FINE) {
            this.Field14297.debug(string);
            return;
        }
        if (level == Level.WARNING) {
            this.Field14297.warn(string);
            return;
        }
        if (level == Level.SEVERE) {
            this.Field14297.error(string);
            return;
        }
        if (level == Level.INFO) {
            this.Field14297.info(string);
            return;
        }
        this.Field14297.trace(string);
    }

    @Override
    public void log(Level level, String string, Object object) {
        if (level == Level.FINE) {
            this.Field14297.debug(string, object);
            return;
        }
        if (level == Level.WARNING) {
            this.Field14297.warn(string, object);
            return;
        }
        if (level == Level.SEVERE) {
            this.Field14297.error(string, object);
            return;
        }
        if (level == Level.INFO) {
            this.Field14297.info(string, object);
            return;
        }
        this.Field14297.trace(string, object);
    }

    @Override
    public void log(Level level, String string, Object[] objectArray) {
        this.log(level, MessageFormat.format(string, objectArray));
    }

    @Override
    public void log(Level level, String string, Throwable throwable) {
        if (level == Level.FINE) {
            this.Field14297.debug(string, throwable);
            return;
        }
        if (level == Level.WARNING) {
            this.Field14297.warn(string, throwable);
            return;
        }
        if (level == Level.SEVERE) {
            this.Field14297.error(string, throwable);
            return;
        }
        if (level == Level.INFO) {
            this.Field14297.info(string, throwable);
            return;
        }
        this.Field14297.trace(string, throwable);
    }

    private static String Method5497(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1230381430L ^ 0xB6A9DE8A;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)97588177L ^ 0x5D1132E);
            int n2 = (int)53256003L ^ 0x32C9FE8;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1664351760 ^ (long)-1664346401) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

