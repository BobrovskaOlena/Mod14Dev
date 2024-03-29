package com.goit.Mod14Dev.data.repository;

import com.goit.Mod14Dev.data.entity.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<NoteEntity, Long> {
}
