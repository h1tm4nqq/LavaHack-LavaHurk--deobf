/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package lavahack.client;

import java.io.File;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Constructor;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import lavahack.client.Class1207;
import lavahack.client.Class1244;
import lavahack.client.Class1635;
import lavahack.client.Class1669;
import lavahack.client.Class1684;
import lavahack.client.Class1851;
import lavahack.client.Class2112;
import lavahack.client.Class906;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class379 {
    public static final Logger Field9593;
    private static final Class379 Field9594;
    private static final String Field9595;
    private final Map Field9596 = new HashMap();
    private final Map Field9597 = new HashMap();
    private final Class1851 Field9598 = new Class1851();
    private ClassLoader Field9599;
    private String Field9600 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static Class379 Method1845() {
        return Field9594;
    }

    public void Method1846(ClassLoader classLoader) {
        if (!(classLoader instanceof URLClassLoader)) {
            throw new IllegalArgumentException("PluginClassLoader was not an URLClassLoader, but: " + classLoader.getClass().getName());
        }
        this.Field9599 = classLoader;
        Field9593.info("PluginManager: Scanning for PluginConfigs.");
        File file = new File("kisman.cc/Plugins");
        Map map = this.Method1847(file.listFiles(), classLoader);
        map.keySet().removeAll(this.Field9597.keySet());
        File[] fileArray = this.Field9598.Method6945(map.values());
        this.Method1847(fileArray, classLoader);
    }

    private Map Method1847(File[] fileArray, ClassLoader classLoader) {
        HashMap hashMap = new HashMap();
        File[] fileArray2 = fileArray;
        int n = fileArray2.length;
        int n2 = 0;
        while (n2 < n) {
            File file = fileArray2[n2];
            if (file.getName().endsWith(".jar")) {
                Field9593.info("PluginManager: Scanning " + file.getName());
                this.Method1849(file, classLoader, hashMap);
            }
            ++n2;
        }
        return hashMap;
    }

    public void Method1848() {
        Iterator iterator = this.Field9597.values().iterator();
        while (iterator.hasNext()) {
            Class1669 class1669 = (Class1669)iterator.next();
            if (this.Field9596.containsKey(class1669)) {
                Field9593.info("Can't register Plugin " + class1669.Method6438() + ", a plugin with that name is already registered.");
                continue;
            }
            Field9593.info("Instantiating: " + class1669.Method6438() + ", MainClass: " + class1669.Method6442());
            Class<?> clazz = Class.forName(class1669.Method6442());
            Constructor<?> constructor = clazz.getConstructor(new Class[0]);
            constructor.setAccessible(true);
            Class906 class906 = (Class906)constructor.newInstance(new Object[0]);
            this.Field9596.put(class1669, class906);
        }
    }

    private void Method1849(File file, ClassLoader classLoader, Map map) throws Exception {
        JarFile jarFile = new JarFile(file);
        Manifest manifest = jarFile.getManifest();
        Attributes attributes = manifest.getMainAttributes();
        String string = attributes.getValue("LavaHackConfig");
        if (string == null) {
            throw new Class1635(jarFile.getName() + ": Manifest doesn't provide a LavaHackConfig!");
        }
        String string2 = attributes.getValue("LavaHackVanilla");
        switch (Class2112.Field17606[Class1207.Method4870().ordinal()]) {
            case 1: {
                if (string2 != null && !string2.equals("false")) break;
                Field9593.info("Found Plugin to remap!");
                map.put(string, file);
                return;
            }
            case 2: 
            case 3: {
                if (string2 == null || !string2.equals("true")) break;
                return;
            }
        }
        Class1244.Method5001((URLClassLoader)classLoader, file);
        Class1669 class1669 = Class1684.Field15829.fromJson((Reader)new InputStreamReader(Objects.requireNonNull(classLoader.getResourceAsStream(string))), Class1669.class);
        if (class1669 == null) {
            throw new Class1635(jarFile.getName() + ": Found a PluginConfig, but couldn't instantiate it.");
        }
        Field9593.info("Found PluginConfig: " + class1669.Method6438() + ", MainClass: " + class1669.Method6442() + ", Mixins: " + class1669.Method6443());
        this.Field9597.put(string, class1669);
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
        Field9593 = LogManager.getLogger((String)"LavaHack Plugins");
        Field9594 = new Class379();
    }

    private static String Method1853(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 236;
            cArray2[n] = (char)(cArray[n] ^ (0x6324 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

