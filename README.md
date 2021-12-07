# 排班系统

模仿学习 staffjoy

## 项目管理
使用git-flow分支管理

5 类分支，分别是：main、dev、功能分支（feature）、发布分支（release）和 hotfix

### main 分支
主分支，与线上运行的版本保持一致，主要特点如下：
* 随时可供部署的稳定版本
* 使用tag 标识不同的发布版本
* 每次更新都须对main添加指定版本的tag，用于发布和回退
* 只能被 release和hotfix分支合并

### dev 分支
开发分支，始终保持最新完成以及bug修复后的代码，新增功能时基于该分支创建feature分支。主要特性如下：
* 保存当前最新开发成果的分支
* dev分支衍生出各个feature分支
* dev分支不能与master分支直接交互

### feature 分支
开发新功能或优化现有功能时，会创建feature分支，以develop为基础创建。主要特性如下：
* 命名规则：feature/*，*代表特性标示，例如feature/1.0.0； 
* feature分支使用develop分支作为它们的父类分支，以功能为单位从develop迁出； 
* 每个feature分支颗粒要尽量小，以利于快速迭代和避免冲突； 
* 当其中一个feature分支完成后，它要合并回develop分支； 
* 当一个功能因为各种原因不开发了或者放弃了，这个分支直接废弃，不影响develop分支； 
* feature分支代码可以保存在开发者本地代码库中而不强制提交到主代码库； 
* feature分支只与develop分支交互，不能与master分支直接交互；

### fix 分支
与feature分支都属于临时性功能分支，其创建规则与feature分支完全一致，唯一的区别是，fix分支仅用于修复bug，不用来开发功能。

### test 分支
当dev分支所有开发完成进入提测阶段时会创建test分支。主要特性如下：
* 命名规则：release/*，*代表发布版本号；
* release分支主要用来为发布新版的测试、修复做准备；
* 当需要为发布新版做准备时，从dev衍生出一个release分支；
* release分支一旦建立就将独立，不可再从其他分支pull代码
* release分支测试通过后，最终应合并回dev分支和main分支；

### hotfix 分支
线上出现紧急问题时，需要及时修复，以main分支为基线，创建hotfix分支。主要特性如下：
* 命名规则：hotfix/*
* hotfix分支用来快速给已发布产品修复bug或微调功能；
* 一旦完成修复bug，应合并回main分支和dev分支；
* main被合并后，应该被标记一个新的版本号；
* 只能从main分支指定tag版本衍生出来；