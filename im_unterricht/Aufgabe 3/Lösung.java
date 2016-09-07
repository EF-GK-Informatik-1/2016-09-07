public void act() {
    while(!started) {
        fahre();
        started = huegelVorhanden("vorne");
    }
    drehe("links");
    setzeMarke();
    fahre();
    while(!markeVorhanden()) {
        fahre();
        if(gesteinVorhanden()) analysiereGestein();
        if(!huegelVorhanden("rechts")) {
            drehe("rechts");
        }
        if(huegelVorhanden("vorne")) {
            drehe("links");
            while(huegelVorhanden("rechts")) {
                fahre();
                if(gesteinVorhanden()) analysiereGestein();
            }
            drehe("rechts");
        }
    }
}
