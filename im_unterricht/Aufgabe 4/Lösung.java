public void act() {
    for(int i = 0; i<3; i++) fahre();
    drehe("links");
    for(int i = 0; i<2; i++) fahre();
    analysiereGestein();
    setzeMarke();
    for(int i = 0; i<2; i++) drehe("links");
    for(int i = 0; i<3; i++) fahre();
    drehe("links");
    for(int i = 0; i<2; i++) fahre();
    analysiereGestein();
    setzeMarke();
    for(int i = 0; i<2; i++) drehe("links");
    while(!huegelVorhanden("vorne")) fahre();
    drehe("rechts");
    fahre();
    drehe("links");
    fahre();
}
