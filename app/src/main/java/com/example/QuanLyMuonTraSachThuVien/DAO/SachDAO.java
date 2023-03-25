package com.example.QuanLyMuonTraSachThuVien.DAO;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.QuanLyMuonTraSachThuVien.database.Dbhelper;
import com.example.QuanLyMuonTraSachThuVien.model.Sach;

import java.util.ArrayList;
import java.util.List;

public class SachDAO {
    private SQLiteDatabase db;
    public SachDAO(Context context){
        Dbhelper dbhelper =new Dbhelper(context);
        db= dbhelper.getWritableDatabase();
    }
    public long insert(Sach obj) {
        ContentValues values = new ContentValues();
        values.put("tenSach", obj.getTenSach());
        values.put("giaThue", obj.getGiaThue());
        values.put("maLoai", obj.getMaLoai());
        values.put("Nhacungcap",obj.getNhacungcap());
        values.put("soluong",obj.getSoluong());
        return db.insert("Sach", null, values);
    }
    public int update(Sach obj){
        ContentValues values = new ContentValues();
        values.put("tenSach",obj.getTenSach());
        values.put("giaThue", obj.getGiaThue());
        values.put("maLoai", obj.getMaLoai());
       values.put("Nhacungcap",obj.getNhacungcap());
        values.put("soluong",obj.getSoluong());
        return db.update("Sach",values,"maSach=?",new String[]{String.valueOf(obj.getMaSach())});
    }
    public int detele(String id){
        return db.delete("Sach","maSach=?",new String[]{id});
    }
    @SuppressLint("Range")
    public List<Sach> getData(String sql, String...selectionArgs){
        List<Sach> list = new ArrayList<>();
        Cursor c = db.rawQuery(sql, selectionArgs);
        while (c.moveToNext()){
            Sach obj = new Sach();
            obj.setNhacungcap(c.getString(c.getColumnIndex("Nhacungcap")));
            obj.setMaSach(Integer.parseInt(c.getString(c.getColumnIndex("maSach"))));
            obj.setTenSach(c.getString(c.getColumnIndex("tenSach")));
            obj.setGiaThue(Integer.parseInt(c.getString(c.getColumnIndex("giaThue"))));
            obj.setMaLoai(Integer.parseInt(c.getString(c.getColumnIndex("maLoai"))));
            obj.setSoluong(Integer.parseInt(c.getString(c.getColumnIndex("soluong"))));

            list.add(obj);
        }
        return list;
    }
    public List<Sach> getAll(){
        String sql = "SELECT * FROM Sach";
        return getData(sql);
    }
    public Sach getID(String id)   {
        String sql = "SELECT * FROM   Sach WHERE maSach=?" ;
        List<Sach> list = getData(sql,id);
        return list.get(0);
    }

    public int getSoluong(String id)   {
        String sql = "SELECT * FROM   Sach WHERE maSach=?" ;
        List<Sach> list = getData(sql,id);
        return list.get(0).getSoluong();
    }
}
