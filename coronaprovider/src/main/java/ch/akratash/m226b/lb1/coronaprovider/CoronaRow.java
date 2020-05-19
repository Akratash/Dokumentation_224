package ch.akratash.m226b.lb1.coronaprovider;

import com.opencsv.bean.CsvBindByName;

public class CoronaRow {
    @CsvBindByName
    private String date;
    @CsvBindByName
    private String time;
    @CsvBindByName(column = "abbreviation_canton_and_fl")
    private String canton;
    @CsvBindByName
    private int ncumul_tested;
    @CsvBindByName
    private int ncumul_conf;
    @CsvBindByName
    private int new_hosp;
    @CsvBindByName
    private int current_hosp;
    @CsvBindByName
    private int current_icu;
    @CsvBindByName
    private int current_vent;
    @CsvBindByName
    private int ncumul_released;
    @CsvBindByName
    private int ncumul_deceased;
    @CsvBindByName
    private String source;

    public CoronaRow(){
        
    }

    public CoronaRow(String date, String time, String canton, int ncumul_tested, int ncumul_conf, int new_hosp,
            int current_hosp, int current_icu, int current_vent, int ncumul_released, int ncumul_deceased,
            String source) {
        this.date = date;
        this.time = time;
        this.canton = canton;
        this.ncumul_tested = ncumul_tested;
        this.ncumul_conf = ncumul_conf;
        this.new_hosp = new_hosp;
        this.current_hosp = current_hosp;
        this.current_icu = current_icu;
        this.current_vent = current_vent;
        this.ncumul_released = ncumul_released;
        this.ncumul_deceased = ncumul_deceased;
        this.source = source;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public int getNcumul_tested() {
        return ncumul_tested;
    }

    public void setNcumul_tested(int ncumul_tested) {
        this.ncumul_tested = ncumul_tested;
    }

    public int getNcumul_conf() {
        return ncumul_conf;
    }

    public void setNcumul_conf(int ncumul_conf) {
        this.ncumul_conf = ncumul_conf;
    }

    public int getNew_hosp() {
        return new_hosp;
    }

    public void setNew_hosp(int new_hosp) {
        this.new_hosp = new_hosp;
    }

    public int getCurrent_hosp() {
        return current_hosp;
    }

    public void setCurrent_hosp(int current_hosp) {
        this.current_hosp = current_hosp;
    }

    public int getCurrent_icu() {
        return current_icu;
    }

    public void setCurrent_icu(int current_icu) {
        this.current_icu = current_icu;
    }

    public int getCurrent_vent() {
        return current_vent;
    }

    public void setCurrent_vent(int current_vent) {
        this.current_vent = current_vent;
    }

    public int getNcumul_released() {
        return ncumul_released;
    }

    public void setNcumul_released(int ncumul_released) {
        this.ncumul_released = ncumul_released;
    }

    public int getNcumul_deceased() {
        return ncumul_deceased;
    }

    public void setNcumul_deceased(int ncumul_deceased) {
        this.ncumul_deceased = ncumul_deceased;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}