package io.github.florentclarret.dailycodingpuzzles.month1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * The goal of this interview is to implement trie (or prefix tree) using dictionaries, where:
 * <p>
 * the dictionary keys are the prefixes
 * the value of a leaf node is None in Python and nil in Ruby.
 * <p>
 * Examples:
 * <p>
 * >>> build_trie("trie")
 * {'t': {'tr': {'tri': {'trie': None}}}}
 * >>> build_trie("tree")
 * {'t': {'tr': {'tre': {'tree': None}}}}
 * >>> build_tree("A","to", "tea", "ted", "ten", "i", "in", "inn")
 * {'A': None, 't': {'to': None, 'te': {'tea': None, 'ted': None, 'ten': None}}, 'i': {'in': {'inn': None}}}
 * >>> build_trie("true", "trust")
 * {'t': {'tr': {'tru': {'true': None, 'trus': {'trust': None}}}}}
 * <p>
 * Happy coding! :)
 */
public class Day24 {

    public static final class PrefixTree {
        private final Map<Character, PrefixTree> map = new TreeMap<>();

        public PrefixTree(final String element) {
            this.addElement(element);
        }

        public PrefixTree() {
        }

        public Map<Character, PrefixTree> getTree() {
            return Collections.unmodifiableMap(map);
        }

        public PrefixTree addElement(final String element) {
            if(element == null) {
                throw new IllegalArgumentException("element must be no null");
            }

            if(element.length() > 0) {
                final char firstChar = element.charAt(0);
                final PrefixTree subTree = map.get(firstChar);

                if(subTree == null) {
                    map.put(firstChar, new PrefixTree(element.substring(1)));
                } else {
                    subTree.addElement(element.substring(1));
                }
            }

            return this;
        }

        @Override
        public String toString() {
            final StringBuilder builder = new StringBuilder("{ ");
            boolean first = true;

            for(final Map.Entry<Character, PrefixTree> entry : this.map.entrySet()) {
                if (!first) {
                    builder.append(", ");
                }
                builder.append(entry.getKey()).append(" -> ").append(entry.getValue().toString());
                first = false;
            }

            return builder.append("}").toString();
        }
    }
}
