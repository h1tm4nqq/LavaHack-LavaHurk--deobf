//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.logging.*;
import java.text.*;

public class Class1389 extends Logger
{
    private final org.apache.logging.log4j.Logger Field14297;
    private String Field14298 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1389(final org.apache.logging.log4j.Logger field14297) {
        super("logger", null);
        this.Field14297 = field14297;
    }
    
    @Override
    public void log(final LogRecord logRecord) {
        this.log(logRecord.getLevel(), logRecord.getMessage());
    }
    
    @Override
    public void log(final Level level, final String s) {
        if (level == Level.FINE) {
            this.Field14297.debug(s);
        }
        else if (level == Level.WARNING) {
            this.Field14297.warn(s);
        }
        else if (level == Level.SEVERE) {
            this.Field14297.error(s);
        }
        else if (level == Level.INFO) {
            this.Field14297.info(s);
        }
        else {
            this.Field14297.trace(s);
        }
    }
    
    @Override
    public void log(final Level level, final String s, final Object o) {
        if (level == Level.FINE) {
            this.Field14297.debug(s, o);
        }
        else if (level == Level.WARNING) {
            this.Field14297.warn(s, o);
        }
        else if (level == Level.SEVERE) {
            this.Field14297.error(s, o);
        }
        else if (level == Level.INFO) {
            this.Field14297.info(s, o);
        }
        else {
            this.Field14297.trace(s, o);
        }
    }
    
    @Override
    public void log(final Level level, final String pattern, final Object[] arguments) {
        this.log(level, MessageFormat.format(pattern, arguments));
    }
    
    @Override
    public void log(final Level level, final String s, final Throwable t) {
        if (level == Level.FINE) {
            this.Field14297.debug(s, t);
        }
        else if (level == Level.WARNING) {
            this.Field14297.warn(s, t);
        }
        else if (level == Level.SEVERE) {
            this.Field14297.error(s, t);
        }
        else if (level == Level.INFO) {
            this.Field14297.info(s, t);
        }
        else {
            this.Field14297.trace(s, t);
        }
    }
    
    private static String Method5497(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5CBC ^ 0xAB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
