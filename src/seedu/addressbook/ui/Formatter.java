package seedu.addressbook.ui;

public class Formatter {
    
    public Formatter() {
    }
    
    /** A decorative prefix added to the beginning of lines printed by AddressBook */
    public String getLinePrefix() {
	return "|| ";
    }

    /** A platform independent line separator. */
    public String getLineSeparator() {
	return System.lineSeparator();
    }

    public String getDivider() {
	return "===================================================";
    }

    /** Format of indexed list item */
    public String indexedListItem() {
	return "\t%1$d. %2$s";
    }


    /** Offset required to convert between 1-indexing and 0-indexing.  */
    public int offset() {
	return 1;
    }

    /** Format of a comment input line. Comment lines are silently consumed when reading user input. */
    public String commentInputLine() {
	return "#.*";
    }
}
