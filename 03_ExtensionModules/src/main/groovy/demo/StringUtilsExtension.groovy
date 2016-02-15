// src/main/groovy/demo/StringUtilsExtension.groovy
package demo
class StringUtilsExtension {
    static String truncate(String self, Integer length, Boolean overflow = false) {
        self.take(length) + (overflow ? '...' : '')
    }
}