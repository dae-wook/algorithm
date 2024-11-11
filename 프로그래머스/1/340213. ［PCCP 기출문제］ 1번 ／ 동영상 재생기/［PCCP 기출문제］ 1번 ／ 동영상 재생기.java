class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        Media media = new Media(video_len, pos, op_start, op_end);
        for(int i = 0; i < commands.length; i++) {
            if(commands[i].equals("prev")) {
                media.prev();
            }else {
                media.next();
            }
        }
        return media.getPos().get();
    }
    
    class Time {
        private int min;
        private int sec;
        
        public Time(String time){
            this.min = Integer.parseInt(time.split(":")[0]);
            this.sec = Integer.parseInt(time.split(":")[1]);
        }
        
        public int isAfter(Time time) {
            if(this.getMergedTime() > time.getMergedTime()) {
                return 1;
            }else if(this.getMergedTime() == time.getMergedTime()) {
                return 0;
            }
            return -1;
        }
        
        public int getMin() {
            return this.min;
        }
        
        public int getSec() {
            return this.sec;
        }
        
        public int getMergedTime() {
            return this.min * 100 + this.sec;
        }
        
        public Time add(Time time) {
            this.min += time.getMin();
            this.sec += time.getSec();
            
            if(this.sec >= 60) {
                this.sec -= 60;
                this.min += 1;
            }
            
            return new Time(this.min + ":" + this.sec);
        }
        
        public Time sub(Time time) {
            this.min -= time.getMin();
            this.sec -= time.getSec();
            
            if(this.sec < 0) {
                this.sec += 60;
                this.min -= 1;
            }
            
            if(this.getMergedTime() < 0) {
                this.min = 0;
                this.sec = 0;
            }
            return new Time(this.min + ":" + this.sec);
        }
        
        public String get() {
            String min = "";
            String sec = "";
            
            if(this.min >= 10) {
                min = this.min + "";
            }else {
                min = "0" + this.min;
            }
            
            if(this.sec >= 10) {
                sec = this.sec + "";
            }else {
                sec = "0" + this.sec;
            }
            
            return min + ":" + sec;
        }
    }
    
    class Media {
        private Time videoLen;
        private Time pos;
        private Time opStart;
        private Time opEnd;
        
        public Media(String video_len, String pos, String op_start, String op_end) {
            this.videoLen = new Time(video_len);
            this.pos = new Time(pos);
            this.opStart = new Time(op_start);
            this.opEnd = new Time(op_end);
            verify();
        }
        
        public void verify() {
            if(this.pos.isAfter(this.opStart) >= 0 && this.pos.isAfter(this.opEnd) < 0) {
                this.pos = new Time(opEnd.get());
            }
        }
        
        public void prev() {
            this.pos.sub(new Time("00:10"));
            System.out.println(this.pos.get());
            System.out.println(this.opStart.get());
            System.out.println(this.opEnd.get());
            System.out.println(this.pos.isAfter(this.opStart) > 0 && this.pos.isAfter(this.opEnd) <= 0);
            verify();
        }
        
        public void next() {
            Time nextTime = new Time(this.pos.add(new Time("00:10")).get());
            Time videoLenCopy = new Time(this.videoLen.get());
            if(videoLenCopy.sub(nextTime).getMergedTime() < 10) {
                this.pos = new Time(videoLen.get());
            }
            if(this.pos.isAfter(this.videoLen) > 0) {
                this.pos = new Time(videoLen.get());
            }
            verify();
        }
        
        public Time getVideoLen() {
            return this.videoLen;
        }
        
        public Time getPos() {
            return this.pos;
        }
        
        public Time getOpEnd() {
            return this.opEnd;
        }
        
        private boolean timeCompare(String time1, String time2) {
            return false;
        }
    }
}