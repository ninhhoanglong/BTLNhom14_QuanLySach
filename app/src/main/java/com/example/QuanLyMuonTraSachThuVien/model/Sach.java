package com.example.QuanLyMuonTraSachThuVien.model;

public class Sach {
    private int maSach;
    private String tenSach;
    private int giaThue;
    private int maLoai;
    private int soluong;

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    private String Nhacungcap;

    public Sach() {
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(int giaThue) {
        this.giaThue = giaThue;
    }

    public int getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    public String getNhacungcap() {
        return Nhacungcap;
    }

    public void setNhacungcap(String nhacungcap) {
        Nhacungcap = nhacungcap;
    }


}
