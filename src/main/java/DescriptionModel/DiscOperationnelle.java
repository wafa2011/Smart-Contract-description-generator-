package DescriptionModel;

public class DiscOperationnelle {
      Functions[] functions;
    Events[] events;

    public DiscOperationnelle() {
    }

    public DiscOperationnelle(Functions[] functions, Events[] events) {
        this.functions = functions;
        this.events = events;
    }

   

    public Functions[] getFunctions() {
        return functions;
    }

    public void setFunctions(Functions[] functions) {
        this.functions = functions;
    }

    public Events[] getEvents() {
        return events;
    }

    public void setEvents(Events[] events) {
        this.events = events;
    }
}
