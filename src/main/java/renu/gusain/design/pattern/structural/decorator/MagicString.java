package renu.gusain.design.pattern.structural.decorator;

import java.io.UnsupportedEncodingException;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MagicString {
    private String string;

    public MagicString(String string) {
        this.string = string;
    }

    public long getNoOfVowel() {
        return this.string.chars().mapToObj(c -> (char) c)
                .filter(c -> "aeiou".contains(c.toString()))
                .count();
    }

    public int length() {
        return string.length();
    }

    public int compareTo(String anotherString) {
        return string.compareTo(anotherString);
    }

    public String strip() {
        return string.strip();
    }

    public String concat(String str) {
        return string.concat(str);
    }

    public String toUpperCase() {
        return string.toUpperCase();
    }

    public char charAt(int index) {
        return string.charAt(index);
    }

    public <R> R transform(Function<? super String, ? extends R> f) {
        return string.transform(f);
    }

    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
        string.getChars(srcBegin, srcEnd, dst, dstBegin);
    }

    public String substring(int beginIndex, int endIndex) {
        return string.substring(beginIndex, endIndex);
    }

    public boolean contentEquals(CharSequence cs) {
        return string.contentEquals(cs);
    }


    public String[] split(String regex, int limit) {
        return string.split(regex, limit);
    }

    public boolean startsWith(String prefix) {
        return string.startsWith(prefix);
    }

    public String toLowerCase() {
        return string.toLowerCase();
    }

    public String formatted(Object... args) {
        return string.formatted(args);
    }

    public int lastIndexOf(int ch, int fromIndex) {
        return string.lastIndexOf(ch, fromIndex);
    }

    public String replaceFirst(String regex, String replacement) {
        return string.replaceFirst(regex, replacement);
    }

    public String toLowerCase(Locale locale) {
        return string.toLowerCase(locale);
    }

    public String substring(int beginIndex) {
        return string.substring(beginIndex);
    }

    public int offsetByCodePoints(int index, int codePointOffset) {
        return string.offsetByCodePoints(index, codePointOffset);
    }

    public boolean regionMatches(int toffset, String other, int ooffset, int len) {
        return string.regionMatches(toffset, other, ooffset, len);
    }

    public String repeat(int count) {
        return string.repeat(count);
    }

    public byte[] getBytes(Charset charset) {
        return string.getBytes(charset);
    }

    public int lastIndexOf(String str, int fromIndex) {
        return string.lastIndexOf(str, fromIndex);
    }

    public boolean matches(String regex) {
        return string.matches(regex);
    }

    public char[] toCharArray() {
        return string.toCharArray();
    }

    public int indexOf(int ch, int fromIndex) {
        return string.indexOf(ch, fromIndex);
    }

    public Stream<String> lines() {
        return string.lines();
    }

    public Optional<String> describeConstable() {
        return string.describeConstable();
    }

    public String stripTrailing() {
        return string.stripTrailing();
    }

    public IntStream chars() {
        return string.chars();
    }

    public int codePointBefore(int index) {
        return string.codePointBefore(index);
    }

    @Deprecated(since = "1.1")
    public void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin) {
        string.getBytes(srcBegin, srcEnd, dst, dstBegin);
    }


    public boolean endsWith(String suffix) {
        return string.endsWith(suffix);
    }

    public String translateEscapes() {
        return string.translateEscapes();
    }

    public int compareToIgnoreCase(String str) {
        return string.compareToIgnoreCase(str);
    }

    public int indexOf(int ch) {
        return string.indexOf(ch);
    }

    public boolean isEmpty() {
        return string.isEmpty();
    }

    public String replace(char oldChar, char newChar) {
        return string.replace(oldChar, newChar);
    }

    public int lastIndexOf(String str) {
        return string.lastIndexOf(str);
    }

    public String trim() {
        return string.trim();
    }

    public String toUpperCase(Locale locale) {
        return string.toUpperCase(locale);
    }

    public boolean startsWith(String prefix, int toffset) {
        return string.startsWith(prefix, toffset);
    }

    public String replace(CharSequence target, CharSequence replacement) {
        return string.replace(target, replacement);
    }

    public int indexOf(String str, int fromIndex) {
        return string.indexOf(str, fromIndex);
    }

    public boolean equalsIgnoreCase(String anotherString) {
        return string.equalsIgnoreCase(anotherString);
    }

    public CharSequence subSequence(int beginIndex, int endIndex) {
        return string.subSequence(beginIndex, endIndex);
    }

    public String stripIndent() {
        return string.stripIndent();
    }

    public int codePointCount(int beginIndex, int endIndex) {
        return string.codePointCount(beginIndex, endIndex);
    }

    public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) {
        return string.regionMatches(ignoreCase, toffset, other, ooffset, len);
    }

    public boolean contentEquals(StringBuffer sb) {
        return string.contentEquals(sb);
    }

    public int indexOf(String str) {
        return string.indexOf(str);
    }

    public String replaceAll(String regex, String replacement) {
        return string.replaceAll(regex, replacement);
    }

    public String indent(int n) {
        return string.indent(n);
    }

    public IntStream codePoints() {
        return string.codePoints();
    }

    public byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
        return string.getBytes(charsetName);
    }

    public boolean isBlank() {
        return string.isBlank();
    }

    public String resolveConstantDesc(MethodHandles.Lookup lookup) {
        return string.resolveConstantDesc(lookup);
    }

    public int codePointAt(int index) {
        return string.codePointAt(index);
    }

    public String stripLeading() {
        return string.stripLeading();
    }

    public String intern() {
        return string.intern();
    }

    public int lastIndexOf(int ch) {
        return string.lastIndexOf(ch);
    }

    public byte[] getBytes() {
        return string.getBytes();
    }

    @Override
    public String toString() {
        return string;
    }

    public boolean contains(CharSequence s) {
        return string.contains(s);


    }
}
