package seedu.addressbook.data.person;

import seedu.addressbook.data.tag.Tag;

/**
 * Association class for tags. Tracks tags that are added or removed.
 */
public class Tagging {
    private boolean state; // true: add, false: remove
    private Person person;
    private Tag tag;

    public Tagging(boolean state, Person person, Tag tag) {
	this.state = state;
	this.person = person;
	this.tag = tag;
    }

    @Override
    public String toString() {
	if (state)
	    return "+ " + person.toString() + " " + tag.toString();
	else
	    return "- " + person.toString() + " " + tag.toString();
    }
}