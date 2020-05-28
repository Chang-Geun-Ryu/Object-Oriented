package academy.pocu.comp2500.assignment2;

public class MeshBanner extends Banner{
    public MeshBanner(BannerSize bannerSize, String bannerColor, OrientationType bannerOrientation) {
        super(BannerType.MESH, bannerSize, bannerColor, bannerOrientation);

        setPrice(bannerSize.getPrice() + 100);
    }
}
