package com.example.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.model.ThoiKhoaBieu;

@Repository
public interface ThoiKhoaBieuRepository extends JpaRepository<ThoiKhoaBieu, Integer> {
    List<ThoiKhoaBieu> findByLopHocMaLop(String maLop);
    List<ThoiKhoaBieu> findByGiangVienMaGV(String maGV);
    List<ThoiKhoaBieu> findByPhongMaPhong(String maPhong);
    List<ThoiKhoaBieu> findByLopHocMaLopAndTuan(String maLop, Integer tuan);
    List<ThoiKhoaBieu> findByGiangVienMaGVAndTuan(String maGV, Integer tuan);
} 