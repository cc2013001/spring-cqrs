package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast1262Index is a Querydsl query type for QPgToast1262Index
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast1262Index extends com.mysema.query.sql.RelationalPathBase<QPgToast1262Index> {

    private static final long serialVersionUID = -1065442295;

    public static final QPgToast1262Index pgToast1262Index = new QPgToast1262Index("pg_toast_1262_index");

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public QPgToast1262Index(String variable) {
        super(QPgToast1262Index.class, forVariable(variable), "pg_toast", "pg_toast_1262_index");
    }

    @SuppressWarnings("all")
    public QPgToast1262Index(Path<? extends QPgToast1262Index> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_1262_index");
    }

    public QPgToast1262Index(PathMetadata<?> metadata) {
        super(QPgToast1262Index.class, metadata, "pg_toast", "pg_toast_1262_index");
    }

}

