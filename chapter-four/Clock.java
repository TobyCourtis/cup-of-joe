class Clock {
    String time;

    void setTime(String t) {
        time = t;
    }

    // this had to be changed to String - void means nothing is returned
    String getTime(){
        return time;
    }
}