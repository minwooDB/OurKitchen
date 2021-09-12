package com.ourkitchen.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QKitchenImageEntity is a Querydsl query type for KitchenImageEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QKitchenImageEntity extends EntityPathBase<KitchenImageEntity> {

    private static final long serialVersionUID = -1883919542L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QKitchenImageEntity kitchenImageEntity = new QKitchenImageEntity("kitchenImageEntity");

    public final StringPath fileName = createString("fileName");

    public final StringPath filePath = createString("filePath");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QKitchenInfoEntity kitchenInfo;

    public final StringPath orgFileName = createString("orgFileName");

    public QKitchenImageEntity(String variable) {
        this(KitchenImageEntity.class, forVariable(variable), INITS);
    }

    public QKitchenImageEntity(Path<? extends KitchenImageEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QKitchenImageEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QKitchenImageEntity(PathMetadata metadata, PathInits inits) {
        this(KitchenImageEntity.class, metadata, inits);
    }

    public QKitchenImageEntity(Class<? extends KitchenImageEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.kitchenInfo = inits.isInitialized("kitchenInfo") ? new QKitchenInfoEntity(forProperty("kitchenInfo"), inits.get("kitchenInfo")) : null;
    }

}

