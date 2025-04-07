package com.example.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Phong")
public class Phong {
    @Id
    @Column(name = "MaPhong")
    private String maPhong;

    @Enumerated(EnumType.STRING)
    @Column(name = "LoaiPhong", nullable = false)
    private LoaiPhong loaiPhong;

    @Enumerated(EnumType.STRING)
    @Column(name = "TrangThai", nullable = false)
    private TrangThai trangThai;

    @NotNull
    @Column(name = "SucChua", nullable = false)
    private Integer sucChua;

    @NotBlank
    @Size(max = 100)
    @Column(name = "ViTri", nullable = false)
    private String viTri;

    // Enums
    public enum LoaiPhong {
        HOC, THUCHANH
    }

    public enum TrangThai {
        TRONG, DANGSUDUNG, BAOTRI
    }

    // Constructor mặc định
    public Phong() {
    }

    public Phong(String maPhong, LoaiPhong loaiPhong, TrangThai trangThai, Integer sucChua, String viTri) {
        this.maPhong = maPhong;
        this.loaiPhong = loaiPhong;
        this.trangThai = trangThai;
        this.sucChua = sucChua;
        this.viTri = viTri;
    }

    // Getters and Setters
    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public LoaiPhong getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(LoaiPhong loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public TrangThai getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(TrangThai trangThai) {
        this.trangThai = trangThai;
    }

    public Integer getSucChua() {
        return sucChua;
    }

    public void setSucChua(Integer sucChua) {
        this.sucChua = sucChua;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }
} 