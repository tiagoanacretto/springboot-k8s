package br.com.anacretto.knote;

import org.springframework.data.mongodb.repository.MongoRepository;

interface NotesRepository extends MongoRepository<Note, String> {

}
