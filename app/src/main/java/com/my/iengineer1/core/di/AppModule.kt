package com.my.iengineer1.core.di

import android.content.Context
import com.my.iengineer1.data.export.BOQPdfExporter
import com.my.iengineer1.data.local.database.AppDb
import com.my.iengineer1.data.local.dao.ProjectDaoKt
import com.my.iengineer1.data.repository.ProjectRepositoryImpl
import com.my.iengineer1.domain.repository.ProjectRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): AppDb =
        AppDb.getInstance(context)

    @Provides
    @Singleton
    fun provideProjectDao(db: AppDb): ProjectDaoKt = db.projectDaoKt()

    @Provides
    @Singleton
    fun provideProjectRepository(dao: ProjectDaoKt): ProjectRepository =
        ProjectRepositoryImpl(dao)

    @Provides
    @Singleton
    fun provideBOQPdfExporter(): BOQPdfExporter = BOQPdfExporter()
}
