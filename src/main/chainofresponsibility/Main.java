package chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        /**
         * Trashcan system entry point
         * User throws multiple pieces of trash which will be processed and eventually categorized individually
         */
        User user = new User();
        user.throwTrash(new Trash(TrashType.PAPER_PAPERBOARD, "toilet paper core"));
        user.throwTrash(new Trash(TrashType.GLASS, "empty beer bottle"));
        user.throwTrash(new Trash(TrashType.METALS, "empty soda can"));
        user.throwTrash(new Trash(TrashType.PLASTIC, "plastic bag"));
        user.throwTrash(new Trash(TrashType.WOOD, "twig"));
        user.throwTrash(new Trash(TrashType.RUBBER_LEATHER_TEXTILE, "old washcloth"));
        user.throwTrash(new Trash(TrashType.NONRECYCLABLE, "napkins"));
    }
}
