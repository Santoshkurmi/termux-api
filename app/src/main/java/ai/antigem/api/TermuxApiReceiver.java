package ai.antigem.api;

/**
 * AntiGem: the termux-api package's binary (rewritten for AntiGem) sends to ai.antigem.api/.TermuxApiReceiver, which
 * Android reads as this class name. This app's own Java package stays com.termux.api.
 */
public class TermuxApiReceiver extends com.termux.api.TermuxApiReceiver {
}
