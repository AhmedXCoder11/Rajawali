[![AndroidLibs](https://img.shields.io/badge/AndroidLibs-Rajawali-brightgreen.svg?style=flat)](https://www.android-libs.com/lib/rajawali?utm_source=github-badge&utm_medium=github-badge&utm_campaign=github-badge)
[![License](https://img.shields.io/badge/license-Apache%202.0%20License-blue.svg)](https://github.com/Rajawali/Rajawali/blob/master/LICENSE.txt)
[![Maven Central](https://img.shields.io/maven-metadata/v/https/oss.sonatype.org/content/repositories/releases/org/rajawali3d/rajawali/maven-metadata.xml.svg)](https://oss.sonatype.org/content/repositories/releases/org/rajawali3d)
[![Maven Central](https://img.shields.io/maven-metadata/v/https/oss.sonatype.org/content/repositories/snapshots/org/rajawali3d/rajawali/maven-metadata.xml.svg)](https://oss.sonatype.org/content/repositories/snapshots/org/rajawali3d)
[![](https://jitpack.io/v/rajawali/rajawali.svg)](https://jitpack.io/#rajawali/rajawali)

# Build Status
**Master Branch Status**  
[![CircleCI](https://circleci.com/gh/Rajawali/Rajawali/tree/master.svg?style=svg)](https://circleci.com/gh/Rajawali/Rajawali/)
[![codecov](https://codecov.io/gh/Rajawali/Rajawali/branch/master/graph/badge.svg)](https://codecov.io/gh/Rajawali/Rajawali)

**Develop Branch Status**  
[![CircleCI](https://circleci.com/gh/Rajawali/Rajawali/tree/develop.svg?style=svg)](https://circleci.com/gh/Rajawali/Rajawali/)

### News

**11/22/2025**  
`Rajawali 1.3.0 Beta-1` تم إصداره بعد توقف طويل عن التحديثات منذ `1.2.1970` (نوفمبر 2021).  
هذا الإصدار يقدم:  
- دعم كامل لـ **OpenGL ES 2.0/3.0** حالياً.  
- دعم **OpenGL ES 3.2** سيتم إضافته قريبًا.  
- إمكانية تحميل **RJ Shaders** (`.rjvs` و `.rjfs`) بشكل غير متزامن Async.  
- تحسين Material لدعم الخصائص القديمة والجديدة معًا.  
- إصلاحات عامة للأداء والثبات.  

> **تنبيه:** الإصدار `1.3.0 Beta-1` **لم يُنشر بعد على Maven Central أو Jitpack** بسبب قيود في صلاحيات النشر. حالياً يمكن استخدامه فقط محليًا أو في النسخ التجريبية الخاصة.  

**06/23/2017**  
`Bombshell 1.1.970` تم إصداره. يصلح سلوك Objects ذات الحجم صفر، ويدعم TextureView و Toon Shader و preprocessor directives للشيدرز والمزيد.  

**11/16/2016**  
`Bombshell 1.1.777` تم إصداره. يصلح بعض الأخطاء ويضيف تأثير Scan Line للمعالجة بعد العرض.  

**9/7/2016**  
الإصدار الرسمي `Bombshell 1.1.610`. استمر الدعم مع إصلاحات أخطاء محدودة. تطوير الإصدار 2.0 بدأ في فرع `v2.0-development`.  

**8/29/2016**  
بدأت الجهود لإضافة Unit Testing لمحرك Rajawali، خصوصًا لفئات الرياضيات الأساسية.  

### General

Rajawali هو محرك 3D للأندرويد مبني على OpenGL ES 2.0/3.0. يمكن استخدامه للتطبيقات العادية وكذلك خلفيات الشاشة الحية (Live Wallpaper).

[انضم لمجتمع Rajawali](https://plus.google.com/u/0/communities/116529974266844528013) للبقاء على اطلاع بأحدث الأخبار.

### Using Rajawali with Maven Central

`implementation 'org.rajawali3d:rajawali:x.x.x@aar'` حيث x.x.x هو رقم الإصدار.  

> الإصدار `1.3.0 Beta-1` غير متوفر على Maven حالياً.  

### Using Rajawali with Jitpack

```groovy
dependencies {
    implementation "com.github.rajawali:rajawali:$latest_version"
}
