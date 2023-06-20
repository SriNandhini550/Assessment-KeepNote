package com.dxc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.model.Note;
import com.dxc.model.User;

@Repository
public interface NoteRepository extends JpaRepository<Note, Integer>{

	List<Note> findNotesBynoteCreatedBy(String userid);

}
