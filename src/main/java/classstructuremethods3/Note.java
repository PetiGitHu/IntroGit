package classstructuremethods3;

public class Note {

    private String name;
    private String topic;
    private String note;

    public String getName(){
        return name;
    }

    public String getTopic(){
        return topic;
    }

    public String getNoteText(){
        return note;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }

    public void setTopic(String newTopic)
    {
        this.topic = newTopic;
    }

    public void setNote(String newNote)
    {
        this.note = newNote;
    }

    public Note(String note) {
        this.note = note;
    }
}
