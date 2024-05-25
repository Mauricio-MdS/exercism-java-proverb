class Proverb {

    private final String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        if (words.length == 0) return "";

        StringBuilder proverb = new StringBuilder();
        for (int i = 1; i < words.length; i++) {
            proverb.append("For want of a %s the %s was lost.\n".formatted(words[i - 1], words[i]));
        }
        proverb.append("And all for the want of a %s.".formatted(words[0]));
        return proverb.toString();
    }

}
