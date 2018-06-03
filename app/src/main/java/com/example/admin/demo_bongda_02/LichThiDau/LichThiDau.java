package com.example.admin.demo_bongda_02.LichThiDau;

/**
 * Created by Admin on 01/06/2018.
 */

public class LichThiDau {
    private int stt;
    private int vong;
    private String thoiGian;
    private String trangThai;
    private String doiA;
    private String tiSo;
    private String doiB;

    public LichThiDau(int stt, int vong, String thoiGian, String trangThai, String doiA, String tiSo, String doiB) {
        this.stt = stt;
        this.vong = vong;
        this.thoiGian = thoiGian;
        this.trangThai = trangThai;
        this.doiA = doiA;
        this.tiSo = tiSo;
        this.doiB = doiB;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public int getVong() {
        return vong;
    }

    public void setVong(int vong) {
        this.vong = vong;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getDoiA() {
        return doiA;
    }

    public void setDoiA(String doiA) {
        this.doiA = doiA;
    }

    public String getTiSo() {
        return tiSo;
    }

    public void setTiSo(String tiSo) {
        this.tiSo = tiSo;
    }

    public String getDoiB() {
        return doiB;
    }

    public void setDoiB(String doiB) {
        this.doiB = doiB;
    }
}
