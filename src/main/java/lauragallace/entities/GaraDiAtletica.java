package lauragallace.entities;

import lauragallace.entities.enums.EventType;

import java.time.LocalDate;
import java.util.Set;

public class GaraDiAtletica extends Event{
    private Set<Person> setAtleti;
    private Person vincitore;
    public GaraDiAtletica(){

    }

    public GaraDiAtletica(String title, LocalDate eventDate, EventType eventType, Location location, Set<Person> setAtleti, Person vincitore) {
        super(title, eventDate, eventType, location);
        this.setAtleti = setAtleti;
        this.vincitore = vincitore;
    }

    public Set<Person> getSetAtleti() {
        return setAtleti;
    }

    public void setSetAtleti(Set<Person> setAtleti) {
        this.setAtleti = setAtleti;
    }

    public Person getVincitore() {
        return vincitore;
    }

    public void setVincitore(Person vincitore) {
        this.vincitore = vincitore;
    }

    @Override
    public String toString() {
        return "GaraDiAtletica{" +
                "vincitore=" + vincitore +
                ", title='" + title + '\'' +
                '}';
    }

}
