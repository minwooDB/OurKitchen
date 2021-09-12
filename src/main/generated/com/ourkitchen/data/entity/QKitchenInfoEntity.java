package com.ourkitchen.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QKitchenInfoEntity is a Querydsl query type for KitchenInfoEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QKitchenInfoEntity extends EntityPathBase<KitchenInfoEntity> {

    private static final long serialVersionUID = 1291231877L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QKitchenInfoEntity kitchenInfoEntity = new QKitchenInfoEntity("kitchenInfoEntity");

    public final QTimeEntity _super = new QTimeEntity(this);

    public final StringPath address = createString("address");

    public final StringPath bizReport = createString("bizReport");

    public final NumberPath<Integer> capacity = createNumber("capacity", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<KitchenImageEntity, QKitchenImageEntity> kitchenImages = this.<KitchenImageEntity, QKitchenImageEntity>createList("kitchenImages", KitchenImageEntity.class, QKitchenImageEntity.class, PathInits.DIRECT2);

    public final NumberPath<Double> lat = createNumber("lat", Double.class);

    public final NumberPath<Double> lng = createNumber("lng", Double.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final StringPath name = createString("name");

    public final NumberPath<Integer> pyeong = createNumber("pyeong", Integer.class);

    public final StringPath telNum = createString("telNum");

    public final QUserEntity user;

    public QKitchenInfoEntity(String variable) {
        this(KitchenInfoEntity.class, forVariable(variable), INITS);
    }

    public QKitchenInfoEntity(Path<? extends KitchenInfoEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QKitchenInfoEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QKitchenInfoEntity(PathMetadata metadata, PathInits inits) {
        this(KitchenInfoEntity.class, metadata, inits);
    }

    public QKitchenInfoEntity(Class<? extends KitchenInfoEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new QUserEntity(forProperty("user")) : null;
    }

}

