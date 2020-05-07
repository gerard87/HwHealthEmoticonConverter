package com.gerard.hwhealthemoticonconverter;

import java.util.HashMap;
import java.util.Map;

class StringUtils {
    private static EmojiAsciiMap emojiAsciiMap = null;

    static String emoticonToTextParser(String text) {
        if (emojiAsciiMap == null) {
            emojiAsciiMap = new EmojiAsciiMap();
        }
        for (Map.Entry entry : emojiAsciiMap.entrySet()) {
            text = text.replaceAll((String) entry.getKey(), " " + entry.getValue() + " ");
        }
        text = text.trim().replaceAll("\\s{2,}", " ");
        return text;
    }

    private static class EmojiAsciiMap extends HashMap<String, String> {
        EmojiAsciiMap() {
            // Face smiling
            put("😀", ":D");
            put("😃", ":D");
            put("😄", ":D");
            put("😁", ":D");
            put("😆", "XD");
            put("😅", "´:D");
            put("🤣", "X'D");
            put("😂", "X'D");
            put("🙂", ":)");
            put("🙃", "(:");
            put("😉", ";)");
            put("😊", "X)");
            put("😇", "0:)");
            // Face affection
            put("🥰", "<3");
            put("😍","<3");
            put("🤩", "=D");
            put("😘", ";*");
            put("😗", ":*");
            put("☺", "X)");
            put("☺️", "X)");
            put("😚", ":*");
            put("😙", ":*");
            // Face tonge
            put("😋", ":P");
            put("😛", ":P");
            put("😜", ";P");
            put("🤪", "%P");
            put("😝", "XP");
            put("🤑", ":P");
            // Face hand
            put("🤗", ":3");
            put("🤭", ":X");
            put("🤫", ":shh:");
            put("🤔", ":think:");
            // Face neural skeptical
            put("🤐", ":|");
            put("🤨", "o_O");
            put("😐", ":|");
            put("😑", ":|");
            put("😶", ":|");
            put("😏", "=)");
            put("😒", "¬¬");
            put("🙄", "=|");
            put("😬", ":[]");
            put("🤥", ":^/");
            // Face sleepy
            put("😌", ":)");
            put("😔", ":|");
            put("😪", "Zzz");
            put("🤤", "zZz");
            put("😴", "zzZ");
            // Face unwell
            put("😷", ":[]");
            put("🤒", ":sick:");
            put("🤢", ":x");
            put("🤮", ":vomit:");
            put("🤧", ":sneeze:");
            put("🥵", ":hot:");
            put("🥶", ":cold");
            put("🥴", ":S");
            put("😵", "XO");
            put("🤯", "*:O");
            // Face hat
            put("🤠", ":D");
            put("🥳", "<:)");
            // Face glasses
            put("😎", "8)");
            put("🤓", "8D");
            put("🧐", "8/");
            // Face concerned
            put("😕", ":/");
            put("😟", ":(");
            put("🙁", ":(");
            put("☹️", ":(");
            put("😢", ":'(");
            put("😰", ":'O");
            put("😯", ":o");
            put("😮", ":O");
            put("😲", ":o");
            put("😦", ":O");
            put("😨", ":O");
            put("😧", ":O");
            put("🥺", ":'|");
            put("😳", "o_O");
            put("😥", "´:(");
            put("😭", ":'O");
            put("😱", "=O");
            put("😖", "XZ");
            put("😣", "X(");
            put("😞", ":(");
            put("😩", "X(");
            put("😫", "X(");
            put("😓", "_:(");
            // Face negative
            put("😤", ">:(");
            put("😡", ">:(");
            put("😠", ">:(");
            put("🤬", ">:(");
            put("😈", ">:)");
            put("👿", ">:(");
            put("💀", ":skull:");
            put("☠", ":skull:");
            // Face costume
            put("💩", ":shit:");
            put("🤡", ":clown:");
            put("👹", ">:(");
            put("👺", ">:(");
            put("👻", ":ghost:");
            put("👽", ":alien:");
            put("👾", ":alien:");
            put("🤖", ":robot:");
            // Cat-face
            put("😺", ":D");
            put("😸", ":D");
            put("😹", ":'D");
            put("😻", "<3");
            put("😼", "=)");
            put("😽", ":*");
            put("🙀", ":O");
            put("😿", ":'(");
            put("😾", ":(");
            // Monkey face
            put("🙈", "&)");
            put("🙉", "XD");
            put("🙊", ":X");
            // Emotion
            put("💋", ":*");
            put("💌", "<3");
            put("❤", "<3");
            put("❤️", "<3");
            put("🧡", "<3");
            put("💛", "<3");
            put("💚", "<3");
            put("💙", "<3");
            put("💜", "<3");
            put("🖤", "<3");
            put("💖", "<3");
            put("💗", "<3");
            put("💓", "<3");
            put("💞", "<3");
            put("💕", "<3");
            put("❣️", "<3");
            put("💔", "</3");
            put("💘", "</3");
            put("💝", "</3");
            put("💟", "<3");
            put("💯", ":100:");
            put("💣", ":bomb:");
            put("💤", "zzz");
            // Hand fingers open
            put("👋", ":hi:");
            put("🤚", ":hi:");
            put("🖐", ":hi:");
            put("✋", ":hi:");
            put("🖖", ":hi:");
            // Hand fingers partial
            put("👌", ":ok:");
            put("✌", ":victory:");
            put("🤞", ":cross fingers:");
            put("🤟", ":horns:");
            put("🤘", ":horns:");
            put("🤙", ":callme:");
            // Hand single finger
            put("👆", "^");
            put("👉", ">");
            put("👈", "<");
            put("🖕", ":fy:");
            put("👇", "\\/");
            put("☝", ":me:");
            // Hand finger closed
            put("👍", ":ok:");
            put("👎", ":down:");
            put("✊", ":fist:");
            put("👊", ":fist:");
            put("🤛", ":fist:");
            put("🤜", ":fist:");
            // Hands
            put("👏", ":clap:");
            put("🙌", ":palms");
            put("👐", ":palms:");
            put("🤲", ":palms:");
            put("🤝", ":handshake:");
            put("🙏", ":please:");
            // Body parts
            put("💪", ":biceps:");
            put("👄", ":*");
            put("👅", ":P");
            put("👀", "o_O");
            put("👁", "o_O");
            // Person
            put("👨", ":man:");
            put("👩", ":woman:");
            // Family
            put("💏", "<3");
            put("💑", "<3");
            // Arrow
            put("🔝", ":top:");
            // Light & video
            put("🎥", ":camera:");
            put("📷", ":photo:");
            // Clothing
            put("👓", "8)");
            put("🕶", "8)");
            // Office
            put("📎", ":clip:");
            // Sky & weather
            put("🌟", "*");
        }
    }

}
