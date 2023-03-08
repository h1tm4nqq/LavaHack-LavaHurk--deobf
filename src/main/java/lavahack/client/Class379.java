//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.net.*;
import java.lang.reflect.*;
import java.util.*;
import java.io.*;
import java.util.jar.*;
import org.apache.logging.log4j.*;

public class Class379
{
    public static final Logger Field9593;
    private static final Class379 Field9594;
    private static final String Field9595;
    private final Map Field9596;
    private final Map Field9597;
    private final Class1851 Field9598;
    private ClassLoader Field9599;
    private String Field9600 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class379() {
        this.Field9596 = new HashMap();
        this.Field9597 = new HashMap();
        this.Field9598 = new Class1851();
    }
    
    public static Class379 Method1845() {
        return Class379.Field9594;
    }
    
    public void Method1846(final ClassLoader field9599) {
        if (!(field9599 instanceof URLClassLoader)) {
            throw new IllegalArgumentException("PluginClassLoader was not an URLClassLoader, but: " + field9599.getClass().getName());
        }
        this.Field9599 = field9599;
        Class379.Field9593.info("PluginManager: Scanning for PluginConfigs.");
        final Map method1847 = this.Method1847(new File("kisman.cc/Plugins").listFiles(), field9599);
        method1847.keySet().removeAll(this.Field9597.keySet());
        this.Method1847(this.Field9598.Method6945((Collection)method1847.values()), field9599);
    }
    
    private Map Method1847(final File[] array, final ClassLoader classLoader) {
        final HashMap hashMap = new HashMap();
        for (final File file : array) {
            if (file.getName().endsWith(".jar")) {
                Class379.Field9593.info("PluginManager: Scanning " + file.getName());
                this.Method1849(file, classLoader, hashMap);
            }
        }
        return hashMap;
    }
    
    public void Method1848() {
        for (final Class1669 class1669 : this.Field9597.values()) {
            if (this.Field9596.containsKey(class1669)) {
                Class379.Field9593.info("Can't register Plugin " + class1669.Method6438() + ", a plugin with that name is already registered.");
            }
            else {
                Class379.Field9593.info("Instantiating: " + class1669.Method6438() + ", MainClass: " + class1669.Method6442());
                final Constructor<?> constructor = Class.forName(class1669.Method6442()).getConstructor((Class<?>[])new Class[0]);
                constructor.setAccessible(true);
                this.Field9596.put(class1669, constructor.newInstance(new Object[0]));
            }
        }
    }
    
    private void Method1849(final File file, final ClassLoader classLoader, final Map map) throws Exception {
        final JarFile jarFile = new JarFile(file);
        final Attributes mainAttributes = jarFile.getManifest().getMainAttributes();
        final String value = mainAttributes.getValue("LavaHackConfig");
        if (value == null) {
            throw new Class1635(jarFile.getName() + ": Manifest doesn't provide a LavaHackConfig!");
        }
        final String value2 = mainAttributes.getValue("LavaHackVanilla");
        switch (Class2112.Field17606[Class1207.Method4870().ordinal()]) {
            case 1: {
                if (value2 == null || value2.equals("false")) {
                    Class379.Field9593.info("Found Plugin to remap!");
                    map.put(value, file);
                    return;
                }
                break;
            }
            case 2:
            case 3: {
                if (value2 != null && value2.equals("true")) {
                    return;
                }
                break;
            }
        }
        Class1244.Method5001((URLClassLoader)classLoader, file);
        final Class1669 class1669 = (Class1669)Class1684.Field15829.fromJson((Reader)new InputStreamReader(Objects.requireNonNull(classLoader.getResourceAsStream(value))), (Class)Class1669.class);
        if (class1669 == null) {
            throw new Class1635(jarFile.getName() + ": Found a PluginConfig, but couldn't instantiate it.");
        }
        Class379.Field9593.info("Found PluginConfig: " + class1669.Method6438() + ", MainClass: " + class1669.Method6442() + ", Mixins: " + class1669.Method6443());
        this.Field9597.put(value, class1669);
    }
    
    public Map Method1850() {
        return this.Field9597;
    }
    
    public Map Method1851() {
        return this.Field9596;
    }
    
    public ClassLoader Method1852() {
        return this.Field9599;
    }
    
    static {
        Field9595 = "kisman.cc/Plugins";
        Field9593 = LogManager.getLogger("LavaHack Plugins");
        Field9594 = new Class379();
    }
    
    private static String Method1853(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6324 ^ 0xEC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
