package classstructuremethods3;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note("Egyszer volt hol nem volt");

        note.setName("Kis Géza");
        note.setTopic("Költemény");
        note.setNote("Másodszor is volt, hol nem volt :) ");

        String name = note.getName();
        String topic = note.getTopic();
        String text = note.getNoteText();

        System.out.println("Az tanulo neve:" + name  + " - Téma:" + topic + " - Leírás: " + text);

        /** * * A fv visszaad egy String-et ami * a következő formában jeleníti meg a Note adatait: * name + ": (" + topic + ") " + text; * * @param prefix ami egy String * @return */

    }
}
