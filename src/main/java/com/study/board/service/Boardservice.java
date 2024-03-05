package com.study.board.service;

import com.study.board.entity.Board;
import com.study.board.repository.Boardrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Boardservice {


        @Autowired
        private Boardrepository boardrepository;
        public void write(Board board) {

            boardrepository.save(board);

        }


        public List<Board> boardList() {

            return boardrepository.findAll();
        }
}
