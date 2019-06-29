.class public final Landroid/support/v4/widget/k;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static a:Ljava/lang/reflect/Method;

.field private static b:Z

.field private static c:Ljava/lang/reflect/Field;

.field private static d:Z


# direct methods
.method public static a(Landroid/widget/PopupWindow;I)V
    .locals 5
    .param p0, "popupWindow"    # Landroid/widget/PopupWindow;
    .param p1, "layoutType"    # I

    .line 153
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 154
    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setWindowLayoutType(I)V

    .line 155
    return-void

    .line 158
    :cond_0
    sget-boolean v0, Landroid/support/v4/widget/k;->b:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    .line 160
    :try_start_0
    const-class v0, Landroid/widget/PopupWindow;

    new-array v3, v2, [Ljava/lang/Class;

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v4, v3, v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v4, "setWindowLayoutType"

    :try_start_1
    invoke-virtual {v0, v4, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Landroid/support/v4/widget/k;->a:Ljava/lang/reflect/Method;

    .line 162
    sget-object v0, Landroid/support/v4/widget/k;->a:Ljava/lang/reflect/Method;

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Method;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 165
    goto :goto_0

    .line 163
    :catch_0
    move-exception v0

    .line 166
    :goto_0
    sput-boolean v2, Landroid/support/v4/widget/k;->b:Z

    .line 168
    :cond_1
    sget-object v0, Landroid/support/v4/widget/k;->a:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_2

    .line 170
    :try_start_2
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v1

    invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 173
    goto :goto_1

    .line 171
    :catch_1
    move-exception v0

    .line 175
    :cond_2
    :goto_1
    return-void
.end method

.method public static a(Landroid/widget/PopupWindow;Landroid/view/View;III)V
    .locals 4
    .param p0, "popup"    # Landroid/widget/PopupWindow;
    .param p1, "anchor"    # Landroid/view/View;
    .param p2, "xoff"    # I
    .param p3, "yoff"    # I
    .param p4, "gravity"    # I

    .line 68
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    .line 69
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;III)V

    goto :goto_0

    .line 71
    :cond_0
    move v0, p2

    .line 72
    .local v0, "xoff1":I
    nop

    .line 73
    invoke-static {p1}, La/b/c/g/u;->d(Landroid/view/View;)I

    move-result v1

    .line 72
    invoke-static {p4, v1}, La/b/c/g/f;->a(II)I

    move-result v1

    and-int/lit8 v1, v1, 0x7

    .line 74
    .local v1, "hgrav":I
    const/4 v2, 0x5

    if-ne v1, v2, :cond_1

    .line 77
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->getWidth()I

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    sub-int/2addr v2, v3

    sub-int/2addr v0, v2

    .line 79
    :cond_1
    invoke-virtual {p0, p1, v0, p3}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 81
    .end local v0    # "xoff1":I
    .end local v1    # "hgrav":I
    :goto_0
    return-void
.end method

.method public static a(Landroid/widget/PopupWindow;Z)V
    .locals 4
    .param p0, "popupWindow"    # Landroid/widget/PopupWindow;
    .param p1, "overlapAnchor"    # Z

    .line 90
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 91
    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setOverlapAnchor(Z)V

    goto :goto_1

    .line 92
    :cond_0
    const/16 v1, 0x15

    if-lt v0, v1, :cond_2

    .line 93
    sget-boolean v0, Landroid/support/v4/widget/k;->d:Z

    const-string v1, "PopupWindowCompatApi21"

    if-nez v0, :cond_1

    .line 95
    const/4 v0, 0x1

    :try_start_0
    const-class v2, Landroid/widget/PopupWindow;

    const-string v3, "mOverlapAnchor"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    sput-object v2, Landroid/support/v4/widget/k;->c:Ljava/lang/reflect/Field;

    .line 96
    sget-object v2, Landroid/support/v4/widget/k;->c:Ljava/lang/reflect/Field;

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    goto :goto_0

    .line 97
    :catch_0
    move-exception v2

    .line 98
    .local v2, "e":Ljava/lang/NoSuchFieldException;
    const-string v3, "Could not fetch mOverlapAnchor field from PopupWindow"

    invoke-static {v1, v3, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 100
    .end local v2    # "e":Ljava/lang/NoSuchFieldException;
    :goto_0
    sput-boolean v0, Landroid/support/v4/widget/k;->d:Z

    .line 102
    :cond_1
    sget-object v0, Landroid/support/v4/widget/k;->c:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_2

    .line 104
    :try_start_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    .line 107
    goto :goto_1

    .line 105
    :catch_1
    move-exception v0

    .line 106
    .local v0, "e":Ljava/lang/IllegalAccessException;
    const-string v2, "Could not set overlap anchor field in PopupWindow"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 110
    .end local v0    # "e":Ljava/lang/IllegalAccessException;
    :cond_2
    :goto_1
    return-void
.end method