package com.gerard.hwhealthemoticonconverter;

class StringUtils {
    static String emoticonToTextParser(String text) {
        return text
                // Face smiling
                .replace("\uD83D\uDE00", " :D ")
                .replace("\uD83D\uDE03", " :D ")
                .replace("\uD83D\uDE04", " :D ")
                .replace("\uD83D\uDE01", " :D ")
                .replace("\uD83D\uDE06", " :D ")
                .replace("\uD83D\uDE05", " ´:D ")
                .replace("\uD83E\uDD23", " :´D ")
                .replace("\uD83D\uDE02", " :´D ")
                .replace("\uD83D\uDE42", " :) ")
                .replace("\uD83D\uDE43", " (: ")
                .replace("\uD83D\uDE09", " ;) ")
                .replace("\uD83D\uDE0A", " :) ")
                .replace("\uD83D\uDE07", " 0:) ")

                // Face affection

                //Face tonge
                .replace("\uD83D\uDE0B", " :P ")
                .replace("\uD83D\uDE1B", " :P ")
                .replace("\uD83D\uDE1C", " ;P ")
                .replace("\uD83E\uDD2A", " :P ")
                .replace("\uD83D\uDE1D", " :P ")
                .replace("\uD83E\uDD11", " :P ")

                // Face hand

                // Hand fingers partial
                .replace("\uD83D\uDC4C", " :ok: ")

                // Hand finger closed
                .replace("\uD83D\uDC4D", " :ok: ");
    }
}
