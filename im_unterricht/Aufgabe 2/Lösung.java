public void act() {
    while(!huegelVorhanden("vorne")) {
        fahre();
        if(!huegelVorhanden("links") && !huegelVorhanden("rechts")) {
            setzeMarke();
        }
    }
}
