package app.class_example;

public class NumberAndStrings {
    public static class Filename {
        private String fullPath;
        private char pathSeparator,
                extensionSeparator;

        public Filename(String str, char sep, char ext) {
            fullPath = str;
            pathSeparator = sep;
            extensionSeparator = ext;
        }

        public String extension() {
            int dot = fullPath.lastIndexOf(extensionSeparator);
            System.out.println("dot extension= " + dot);
            return fullPath.substring(dot + 1);
        }

        // gets filename without extension
        public String filename() {
            int dot = fullPath.lastIndexOf(extensionSeparator);
            System.out.println("dot filename= " + dot);
            int sep = fullPath.lastIndexOf(pathSeparator);
            System.out.println("sep filename = " + sep);
            return fullPath.substring(sep + 1, dot);
        }

        public String path() {
            int sep = fullPath.lastIndexOf(pathSeparator);
            System.out.println("sep path = " + sep);
            return fullPath.substring(0, sep);
        }
    }

}
