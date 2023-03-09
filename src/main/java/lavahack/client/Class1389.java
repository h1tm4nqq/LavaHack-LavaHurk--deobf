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

public class Class1389
extends java.util.logging.Logger {
    private final Logger Field14297;
    private String Field14298 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1389(Logger logger) {
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
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 171;
            cArray2[n] = (char)(cArray[n] ^ (0x5CBC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

